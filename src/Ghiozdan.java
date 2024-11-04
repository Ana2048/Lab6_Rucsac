public class Ghiozdan {

    Rechizita[] rechizite= new Rechizita[10];

    private int ct=0;
    public void addRechizita(Rechizita r)
    {
        rechizite[ct]=r;
        ct++;
    }

    public void listItems(){
        for(int i=0;i<ct;i++ ) {
            System.out.println(rechizite[i].getNume());
        }
    }

    public void listManual(){
        for(int i=0;i<ct;i++) {
            if (rechizite[i] instanceof Manual)
                System.out.println(rechizite[i].getNume());
        }
    }
    public void listCaiet(){
        for(int i=0;i<ct;i++) {
            if (rechizite[i] instanceof Caiet)
                System.out.println(rechizite[i].getNume());
        }
    }

    public int getNrRechizite(){
        return ct;
    }

    public int getNrManuale(){
        int nr=0;
        for(int i=0;i<ct;i++){
            if(rechizite[i] instanceof Manual)
                nr++;
        }
        return nr;
    }

    public int getNrCaiet(){
        int nr=0;
        for(int i=0;i<ct;i++)
        {
            if(rechizite[i] instanceof Caiet)
                nr++;
        }
        return nr;
    }

}
