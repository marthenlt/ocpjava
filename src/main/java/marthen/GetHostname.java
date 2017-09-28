package marthen;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHostname
 */
public class GetHostname extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetHostname() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InetAddress ip;
		try {

			ip = InetAddress.getLocalHost();
			String hostname = ip.getHostName();
			String ipAddress = ip.getHostAddress();
			response.getWriter().append("[" + ipAddress + "] " + hostname);
//			response.getWriter().append("Hostname : " + hostname);

		} catch (UnknownHostException e) {
			e.printStackTrace();

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
