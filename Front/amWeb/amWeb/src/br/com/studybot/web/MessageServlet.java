package br.com.studybot.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.studybot.chat.Chat;
import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.conversation.v1.Conversation;
import com.ibm.watson.developer_cloud.conversation.v1.model.Context;
import com.ibm.watson.developer_cloud.conversation.v1.model.InputData;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;



@WebServlet(urlPatterns = "/chat")
public class MessageServlet extends HttpServlet{

	private Context context;
	private static final long serialVersionUID = 6093948662123015033L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		String message = req.getParameter("question");
		if (message.isEmpty())  this.context = null;
		MessageResponse response = this.conversationAPI(message, context);
		Chat chat = new Chat();
		chat.addUserMessage(message);
		for(String text : response.getOutput().getText()) {
			chat.addBotMessage(text);
		}
		context = response.getContext();
		resp.setContentType("application/json");
		resp.getWriter().write(new Gson().toJson(response.getOutput().getText()));
	}
	
	private MessageResponse conversationAPI(String input, Context context){
		Conversation service = new Conversation("2018-09-24"); // Data que o workspace foi criado
		service.setUsernameAndPassword("3da2566b-9f85-46e9-8c8a-24c011e4f986", "S8gqK32fgjG3");
		InputData inputData = new InputData.Builder().text(input).build();
		MessageRequest newMessage = new MessageRequest();
		newMessage.setInput(inputData);
		String workspaceId = "022acc19-0592-4b6c-a4a0-5ce6d99b8ed9";
		MessageOptions options = new MessageOptions.Builder(workspaceId).input(inputData).context(context).build();
		MessageResponse response = service.message(options).execute();
		return response;
	} 

}
