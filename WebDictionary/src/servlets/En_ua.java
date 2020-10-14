package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import worker.Handler;



public class En_ua extends HttpServlet {
	private String word = Handler.getNextWord();
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EN_UA SERVLET");
		if(Handler.created)word = Handler.getNextWord();
		if(word!=null)
		{
			request.setAttribute("servlet", "/WebDictionary/TesterServlet");
			request.setAttribute("word", word);
			RequestDispatcher dispatcher = request.getRequestDispatcher("en_ua.jsp");
			dispatcher.forward(request, response);
			Handler.created=true;
		}
		else
		{
			Handler.clear();
			word = Handler.getNextWord();
			RequestDispatcher dispatcher = request.getRequestDispatcher("done.jsp");
			dispatcher.forward(request, response);
		}
			
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}