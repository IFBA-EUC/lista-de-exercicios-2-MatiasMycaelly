public class Questao16 {
    
    private int horas;
    private int minutos;
    private int segundos;

    public void setTp(int segundos){
        this.horas = segundos / 3600;
        int r = segundos % 3600;
        this.minutos = r / 60;
        r = r % 60;
        this.segundos = r;
    }

    public int getH(){
        return this.horas;
    }
    
    public int getM(){
        return this.minutos;
    }

    public int getS(){
        return this.segundos;
    }

    public void status(){
        System.out.println("Horas: " +getH());
        System.out.println("Minutos: " +getM());
        System.out.println("Segundos: " +getS());
    }


}
