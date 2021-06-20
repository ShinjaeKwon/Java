public class Voca {
    private String eword, kword;

    public Voca(String eword, String kword) {
        this.eword = eword;
        this.kword = kword;
    }

    public String getEword() {
        return eword;
    }

    public void setEword(String eword) {
        this.eword = eword;
    }

    public String getKword() {
        return kword;
    }

    public void setKword(String kword) {
        this.kword = kword;
    }

    @Override
    public String toString() {
        return "Voca{" +
                "eword='" + eword + '\'' +
                ", kword='" + kword + '\'' +
                '}';
    }
}
