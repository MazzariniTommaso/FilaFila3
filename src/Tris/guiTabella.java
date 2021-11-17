package Tris;


	public enum guiTabella
	{
		q(0,0),w(0,1),e(0,2),a(1,0),s(1,1),d(1,2),z(2,0),x(2,1),c(2,2);
		private final int colonna;
		private final int riga;
		guiTabella(int i, int j) 
		{
			this.colonna = j;
			this.riga = i;
		}
		public int getRiga() {return this.riga;}
		public int getColonna() {return this.colonna;}
	};


