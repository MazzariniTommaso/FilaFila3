import java.util.*;
import Tris.*;
public class Main {

	public static void main(String[] args) 
	{
		Tabella t = new Tabella();
		int input;
		Scanner in = new Scanner(System.in);
		System.out.println("_[TRIS]_");
		
		do 
		{
			do 
			{
				System.out.println("\nMenu");
				System.out.println("1) Guida");
				System.out.println("2) Gioca");
				System.out.println("0) exit");
				input = in.nextInt();
				
				if (input != 1 && input != 2 &&input != 0) System.out.println("!Carattere non consentito!");	
			}while(input != 1 && input != 2 && input != 0);
	
			switch (input)
			{
			case 0: System.exit(0);break;
			case 1: 
				{
					System.out.println("Regole:\n"
										+ "- Chi riempie per primo una qualsiasi riga/colonna/diagonale vince il gioco\n"
										+ "- Importante: Scegliere le caselle vuote\n");
					t.VisualizzaScelte();break;
				}
			case 2: MenuGioco();break;
			}
		}while(true);

	}
	
	public static int MenuGioco()
	{
		Tabella t = new Tabella();
		int input, i= 0;
		Scanner in = new Scanner(System.in);
		do 
		{
			System.out.println("Giocatore 1 con cosa vuoi giocare?");
			System.out.println("1) X");
			System.out.println("2) O");
			input = in.nextInt();
			if (input != 1 && input != 2) System.out.println("!Carattere non consentito!");	
		}while(input != 1 && input != 2);
		
		char carattereGioco1 = (input == 1) ? 'X' : 'O';
		char carattereGioco2 = (carattereGioco1 == 'X') ? 'O' : 'X';
		System.out.println("Giocatore 1 gioca con: " + carattereGioco1);
		System.out.println("Giocatore 2 gioca con: " + carattereGioco2 + '\n');
		
		t.VisualizzaScelte();

		do
		{
			System.out.print("scelta Giocatore 1: ");
			t.setTabella(scelta(in.next().charAt(0)), carattereGioco1);
			t.VisualizzaGioco();
			if (t.controlloVittoria() == 'p' && i<8)
			{
				System.out.print("scelta Giocatore 2: ");
				t.setTabella(scelta(in.next().charAt(0)), carattereGioco2);
				t.VisualizzaGioco();
				i++;
			}

		}while(t.controlloVittoria() == 'p' && i<9);
		if (t.controlloVittoria() == carattereGioco1) System.out.println("Ha vinto il giocatore 1");
		else if (t.controlloVittoria() == carattereGioco2) System.out.println("Ha vinto il giocatore 2");
		else System.out.println("Pareggio");
		return 0;

	}

	public static guiTabella scelta(char a)
	{
		guiTabella ss = null;
		switch(a)
		{
		case 'q': ss = guiTabella.q;break;
		case 'w': ss = guiTabella.w;break;
		case 'e': ss = guiTabella.e;break;
		case 'a': ss = guiTabella.a;break;
		case 's': ss = guiTabella.s;break;
		case 'd': ss = guiTabella.d;break;
		case 'z': ss = guiTabella.z;break;
		case 'x': ss = guiTabella.x;break;
		case 'c': ss = guiTabella.c;break;
		}
		return ss;
		
	}
}
