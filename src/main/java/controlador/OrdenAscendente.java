package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Parcela;
import modelo.ParcelaModelo;

/**
 * Servlet implementation class OrdenAscendente
 */
@WebServlet("/OrdenAscendente")
public class OrdenAscendente extends HttpServlet implements Comparator<Parcela> {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrdenAscendente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ParcelaModelo mParcela = new ParcelaModelo();


		ArrayList<Parcela> parcelas = mParcela.getParcelas();


		parcelas.sort(this);

		request.setAttribute("parcelas", parcelas);

		request.getRequestDispatcher("inicio.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public int compare(Parcela o1, Parcela o2) {

		Parcela parcela1 = (Parcela) o1;
		Parcela parcela2 = (Parcela) o2;
		return (parcela1.getNumero().compareTo(parcela2.getNumero()));
	}

}