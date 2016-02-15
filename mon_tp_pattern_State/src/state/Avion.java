package state;

public class Avion {
	private Etat etat;
	private int carburant;
	
	public Avion() {
		etat = new EtatGarage();
		carburant=200;
	}

	public void doAction() {
		etat.doAction();
	}

	public void sortirDuGarage() {
		etat.sortirDuGarage();
	}

	public void entrerDsGarage() {
		etat.entrerDsGarage();
	}

	public void decoller() {
		etat.decoller();
	}

	public void atterir() {
		etat.atterir();
	}

	
	interface Etat
	{
		public void doAction();
		public void sortirDuGarage();
		public void entrerDsGarage();
		public void decoller();
		public void atterir();
	}
	
	class EtatGarage implements Etat
	{
		@Override
		public void doAction() {
			System.out.println("Etat Garage");
		}

		@Override
		public void sortirDuGarage() {
			System.out.println("Transition d'etat du garage vers piste");
			etat=new EtatPiste();
		}

		@Override
		public void entrerDsGarage() {
			System.out.println("je suis deja au  garage");

		}

		@Override
		public void decoller() {
		    System.out.println("Impossible de passer en air");

		}

		@Override
		public void atterir() {
			System.out.println("Impossible d'atterir");

		}
		
	}
	
	class EtatPiste implements Etat
	{

		@Override
		public void doAction() {
			System.out.println("Etat Pist");	
		}

		@Override
		public void sortirDuGarage() {
			System.out.println("je suis deja dans la piste");
			
		}

		@Override
		public void entrerDsGarage() {
			System.out.println("Transition d'etat de la piste vers garage");
			etat=new EtatGarage();
		}

		@Override
		public void decoller() {
			System.out.println("Transition d'etat de la piste vers l'air");
			etat=new EtatAir();
		}

		@Override
		public void atterir() {
			System.out.println("je suis deja dans la piste");
		}
		
	}
	
         class EtatAir implements Etat
         {

			@Override
			public void doAction() {
				System.out.println("Etat Air");
			}

			@Override
			public void sortirDuGarage() {
				System.out.println("Transition impossible de l'air vers piste");
			}

			@Override
			public void entrerDsGarage() {
				System.out.println("Transition impossible de l'air vers garage");
			}

			@Override
			public void decoller() {
				System.out.println("je suis deja en air");
			}			

			@Override
			public void atterir() {
				if(carburant>300)
				{
				System.out.println("Transition d'etat de l'air vers piste");
				etat=new EtatPiste();
				}
				else System.out.println("la quantite du carburant est insuffisante");
				
			}
        	 
         }
}
