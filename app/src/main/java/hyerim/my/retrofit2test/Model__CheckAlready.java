package hyerim.my.retrofit2test;

import java.util.ArrayList;

public class Model__CheckAlready {
    ArrayList<Listitem> list;
    private boolean isRight = false;

    private int type;
    private String masteR_UID;
    private String reason;

    public Model__CheckAlready(int type, String masteR_UID) {
        this.type = type;
        this.masteR_UID = masteR_UID;
    }

    public ArrayList<Listitem> getList() {
        return list;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setMasteR_UID(String masteR_UID) {
        this.masteR_UID = masteR_UID;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getType() {
        return type;
    }

    public String getMasteR_UID() {
        return masteR_UID;
    }

    public String getReason() {
        return reason;
    }

    public void setRight(boolean right) {
        isRight = right;
    }


    public boolean isRight() {
        return isRight;
    }
}
