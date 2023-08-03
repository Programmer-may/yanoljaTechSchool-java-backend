package kr.fc.model;

public class Movie {
    // 영화(Object) -> 제목, 이름, 제작사, 가격, 등급

    //정보은닉
    private String mTitle;
    private String mName;
    private String mCompany;
    private int mPrice;
    private int mLevel;

    public Movie() {
        //기본 생성자
    }
    public Movie(String mTitle, String mName, String mCompany, int mPrice, int mLevel) {
        //오버로딩
        this.mTitle = mTitle;
        this.mName = mName;
        this.mCompany = mCompany;
        this.mPrice = mPrice;
        this.mLevel = mLevel;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCompany() {
        return mCompany;
    }

    public void setmCompany(String mCompany) {
        this.mCompany = mCompany;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    public int getmLevel() {
        return mLevel;
    }

    public void setmLevel(int mLevel) {
        this.mLevel = mLevel;
    }

    @Override
    public String toString() {
        //오버라이드 -> 재정의
        return "Movie{" +
                "mTitle='" + mTitle + '\'' +
                ", mName='" + mName + '\'' +
                ", mCompany='" + mCompany + '\'' +
                ", mPrice=" + mPrice +
                ", mLevel=" + mLevel +
                '}';
    }
}
