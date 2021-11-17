package Tris;

public class Casella 
{
	private char valCasella;
	
	public Casella(char valCasella) 
	{
		this.valCasella = valCasella;
	}
	public char getValCasella() {return this.valCasella;}
	
	public String toString() {
		return this.valCasella+"";
	}
}

