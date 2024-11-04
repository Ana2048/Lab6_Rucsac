//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Ghiozdan ghiozdan=new Ghiozdan();
            Caiet c1=new Caiet("Matematica");
            Caiet c2=new Caiet("Romana");
            Caiet c3=new Caiet("Istorie");

            Manual m1=new Manual("Manual de Matematica");
            Manual m2=new Manual("Manual de Romana");
            Manual m3=new Manual("Manual de Istorie");

            ghiozdan.addRechizita(c1);
            ghiozdan.addRechizita(c2);
            ghiozdan.addRechizita(c3);
            ghiozdan.addRechizita(m1);
            ghiozdan.addRechizita(m2);
            ghiozdan.addRechizita(m3);

            System.out.println("Nr total rechizite : "+ ghiozdan.getNrRechizite());
            System.out.println("Nr total caiete: "+ ghiozdan.getNrCaiet());
            System.out.println("Nr total manual: "+ ghiozdan.getNrManuale());

            System.out.println("---------");

            ghiozdan.listItems();
            ghiozdan.listCaiet();
            ghiozdan.listManual();

    }
}