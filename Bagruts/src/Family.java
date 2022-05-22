public class Family {
    private int num;
    private String familyName;

    public Family(int num, String familyName) {
        this.num = num;
        this.familyName = familyName;
    }

    public int calcPrice() {
        int tot = 100;
        if (this.num <= 3) {
            // tot = (30 * this.num) + tot
            tot = tot + 30 * this.num;
        } else {
            if (this.num <= 5) {
                tot = tot + 28 * this.num;
            } else {
                tot = tot + 26 * this.num;
            }
        }

        return tot;
    }
}
