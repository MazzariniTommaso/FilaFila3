package Tris;


public class Tabella 
{
	
	private Casella[][] tabella = new Casella[3][3];
	
	Casella c = new Casella('O');
	Casella r = new Casella('X');

	//tabella[0][0] tabella[0][1]tabella[0][2]
	public void VisualizzaGioco()
	{
		System.out.println(
			   "[" + visXO(0,0) + "|" + visXO(0,1) + "|" + visXO(0,2) + "]\n"+
			   "[" + visXO(1,0) + "|" + visXO(1,1) + "|" + visXO(1,2) + "]\n" +
			   "[" + visXO(2,0) + "|" + visXO(2,1) + "|" + visXO(2,2) + "]\n");
	}
	public void VisualizzaScelte()
	{
		System.out.println(
			   "[" + guiTabella.q+ "|" + guiTabella.w + "|" + guiTabella.e + "]\n"+
			   "[" + guiTabella.a + "|" + guiTabella.s + "|" + guiTabella.d+ "]\n" +
			   "[" + guiTabella.z+ "|" + guiTabella.x + "|" + guiTabella.c + "]\n");
	}
	
	
	public Tabella() {}

	//public Casella[][] getTabella() {return tabella;}


	public void setTabella(guiTabella e, char v) 
	{
		tabella[e.getRiga()][e.getColonna()] = new Casella(v);
		
	}
	
	private char visXO(int riga, int colonna)
	{
		if (this.tabella[riga][colonna] == null) return ' ';
		if (this.tabella[riga][colonna].getValCasella() == c.getValCasella()) return 'O';
		if (this.tabella[riga][colonna].getValCasella() == r.getValCasella()) return 'X';
		return '∆';
	}
	
	public char controlloVittoria()
	{
		int sommax = 0;
		int sommao = 0;
		
		for (int i = 0; i < 3; i++) 
			{
				for(int j = 0; j < 3; j++) 
				{
					if (tabella[i][j] !=  null) 
					{
						if (tabella[i][j].getValCasella() == 'X') sommax += 1;
						else sommao += 2;
					}
				}
				if (sommax == 3) return 'X';
				if (sommao == 6) return 'O';
				
				sommax = 0;
				sommao = 0;
			}

		for (int i = 0; i < 3; i++) 
		{
			for(int j = 0; j < 3; j++) 
			{
				if (tabella[j][i] !=  null) 
				{
					if (tabella[j][i].getValCasella() == 'X') sommax += 1;
					else sommao += 2;
				}
			}
			if (sommax == 3) return 'X';
			if (sommao == 6) return 'O';
			
			sommax = 0;
			sommao = 0;
		}

		for (int i = 0, j = 2; i < 3; i++, j--) 
		{
				if (tabella[i][j] !=  null) 
				{
					if (tabella[i][j].getValCasella() == 'X') sommax += 1;
					else sommao += 2;
				}
		}
		if (sommax == 3) return 'X';
		if (sommao == 6) return 'O';
		
		sommax = 0;
		sommao = 0;
		
		
	
		for (int i =0; i < 3; i++) 
		{
				if (tabella[i][i] !=  null) 
				{
					if (tabella[i][i].getValCasella() == 'X') sommax += 1;
					else sommao += 2;
				}
		}
		if (sommax == 3) return 'X';
		if (sommao == 6) return 'O';
		return 'p';
	}
	
	public boolean èUsato(char scelta) {
		boolean flagQ = false;
		boolean flagW = false;
		boolean flagE = false;
		boolean flagA = false;
		boolean flagS = false;
		boolean flagD = false;
		boolean flagZ = false;
		boolean flagX = false;
		boolean flagC = false;
		boolean flagRisposta =false;

		switch(scelta) {
		case 'q':
			if(!flagQ) {
				flagQ = true;
				flagRisposta = true;
			}
			break;
		case 'w':
			if(!flagW) {
				flagW = true;
				flagRisposta = true;
			}
			break;
		case 'e':
			if(!flagE) {
				flagE = true;
				flagRisposta = true;
			}
			break;
		case 'a':
			if(!flagA) {
				flagA = true;
				flagRisposta = true;
			}
			break;
		case 's':
			if(!flagS) {
				flagS = true;
				flagRisposta = true;
			}
			break;
		case 'd':
			if(!flagD) {
				flagD = true;
				flagRisposta = true;
			}
			break;
		case 'z':
			if(!flagZ) {
				flagZ = true;
				flagRisposta = true;
			}
			break;
		case 'x':
			if(!flagX) {
				flagX = true;
				flagRisposta = true;
			}
			break;
		case 'c':
			if(!flagC) {
				flagC = true;
				flagRisposta = true;
			}break;
		}
		
		return flagRisposta;
	}
}
		