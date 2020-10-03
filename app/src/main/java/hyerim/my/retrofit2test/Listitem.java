package hyerim.my.retrofit2test;

import android.util.Log;

public class Listitem {
    private int idx, total_PageCnt, total_ReportCnt, total_Like, total_Bad, total_ComentCnt;
    private String nicName, category, title, contents, link1, lInk2, image, regDate;

    public void setTotal_PageCnt(int total_PageCnt) {
        this.total_PageCnt = total_PageCnt;
    }

    public void setTotal_ReportCnt(int total_ReportCnt) {
        this.total_ReportCnt = total_ReportCnt;
    }

    public void setTotal_Like(int total_Like) {
        this.total_Like = total_Like;
    }

    public void setTotal_Bad(int total_Bad) {
        this.total_Bad = total_Bad;
    }

    public void setTotal_ComentCnt(int total_ComentCnt) {
        this.total_ComentCnt = total_ComentCnt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setLink1(String link1) {
        this.link1 = link1;
    }

    public void setlInk2(String lInk2) {
        this.lInk2 = lInk2;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getTotal_PageCnt() {
        return total_PageCnt;
    }

    public int getTotal_ReportCnt() {
        return total_ReportCnt;
    }

    public int getTotal_Like() {
        return total_Like;
    }

    public int getTotal_Bad() {
        return total_Bad;
    }

    public int getTotal_ComentCnt() {
        return total_ComentCnt;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getLink1() {
        return link1;
    }

    public String getlInk2() {
        return lInk2;
    }

    public String getImage() {
        return image;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIdx() {
        return idx;
    }

    public String getNicName() {
        return nicName;
    }

    public String getCategory() {
        return category;
    }
}
