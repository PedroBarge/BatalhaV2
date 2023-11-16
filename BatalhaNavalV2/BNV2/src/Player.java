public class Player {

    String Name;
    boolean isCPU = false;

    public Player(String name) {
        Name = name;
    }

    public Player(String name, boolean isCPU) {
        Name = name;
        this.isCPU = isCPU;
    }

    public void checkPlayer() {
        if (isCPU) {
            CPU cpu = new CPU("CPU",true);
            cpu.
        }
    }
}
