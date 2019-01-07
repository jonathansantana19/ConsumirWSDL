package br.com.services.main;

import java.rmi.RemoteException;

import org.tempuri.CResultado;
import org.tempuri.CServico;
import org.tempuri.CalcPrecoPrazoWSSoapStub;

public class App {

	
	
	public static void main(String[] args) throws RemoteException {
		
		System.out.println("iniciandoo");
		
//		CalcPrecoPrazoWSSoapStub calcPrazo = new CalcPrecoPrazoWSSoapStub();
		
//		CResultado res = calcPrazo.calcPrazo("4010", "99010101", "99070000");
		
		CResultado res = new CalcPrecoPrazoWSSoapStub().calcPrazo("4010", "99010101", "99070000");
		
		
		CServico[] lista = res.getServicos();
		
		
		for (CServico obj : lista) {
			
			System.out.println(obj.getMsgErro());
			
		}
		
		
		
	}
	
}
