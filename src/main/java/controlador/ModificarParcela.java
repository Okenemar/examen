package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Parcela;
import modelo.ParcelaModelo;

/**
 * Servlet implementation class ModificarParcela
 */
@WebServlet("/ModificarParcela")
public class ModificarParcela extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarParcela() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParcelaModelo mParcela = new ParcelaModelo();
		int id = Integer.parseInt(request.getParameter("id"));
		Parcela parcela = mParcela.getParcela(id);
		
		request.setAttribute("parcela", parcela);
		request.getRequestDispatcher("modificarParcela.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParcelaModelo mParcela = new ParcelaModelo();
		Parcela parcela = new Parcela();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String numero = request.getParameter("numero");
		int m_cuadrados = Integer.parseInt(request.getParameter("m_cuadrados"));
		Double precio_dia = Double.parseDouble(request.getParameter("precio_dia"));
		
		parcela.setId(id);
		parcela.setNumero(numero);
		parcela.setM_cuadrados(m_cuadrados);
		parcela.setPrecio_dia(precio_dia);
		
		mParcela.modificarParcela(parcela);
		
		request.getRequestDispatcher("Inicio").forward(request, response);
		
		
	}

}
