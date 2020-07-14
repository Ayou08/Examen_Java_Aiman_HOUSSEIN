//EXAMEN JAVA AIMAN HOUSSEIN GLRS2


interface IService{

    public void affiche();
}




public class Service implements IService {

    private static int compt = 0;
    private int id = 0;
    private String libelle;

    private Service[] services;


    public Service(String libelle){
        
        Service.compt += 1;
        this.id = Service.compt;
        this.libelle = String.valueOf(Service.compt);
    }

    public void affiche(){
	System.out.println("....");
    }


    public void AjouterService(Service service){
        
        services[this.id - 1] = service;

    }

    public void listerServices(){

        for(Service service : services){
            
            service.affiche();
        }
    }

}




 abstract class Employe implements IService{

    private static int compt = 0;
    private static int id;
    private String nomComplet;

    public Employe(String nomComplet){

        Employe.compt += 1;
        this.id = Employe.compt;
        this.nomComplet = nomComplet;
    }
    
    public void affiche(){
        System.out.println("....");
    }

    abstract public boolean isEmbauche();
    abstract public boolean isJournalier();

}

class Embauche extends Employe{

    private double salaire;
    private String dateEmb = "";

    	public Embauche(String nomComplet, double salaire, String dateEmb){

        super(nomComplet);
        this.salaire = salaire;
        this.dateEmb = dateEmb;
    }

    	public boolean isEmbauche(){

        return true;
    }

   	 public boolean isJournalier(){
        
        return false;
    }

    	public void affiche(){
	System.out.println("....");
    }

}

class Journalier extends Employe{

    private int duree = 2;
    private int forfait;

   	 public Journalier(String nomComplet, int duree, int forfait) {
        
        supere(nomComplet);
        this.duree = duree;
        this.forfait = forfait;

    }

    	public boolean isJournalier(){

        return true;
    }

    	public boolean isEmbauche(){
        
        return false;
    }

    	public void affiche(){
	System.out.println(".....");
    }


}


