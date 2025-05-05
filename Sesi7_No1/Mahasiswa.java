public class Mahasiswa<N, M, C> {
    private N nim;
    private M name;
    private C clas;

    public void setNim(N nim) {
        this.nim = nim;
    }

    public void setName(M name) {
        this.name = name;
    }

    public void setClas(C clas) {
        this.clas = clas;
    }

    public N getNim() {
        return nim;
    }

    public M getName() {
        return name;
    }

    public C getClas() {
        return clas;
    }
}
