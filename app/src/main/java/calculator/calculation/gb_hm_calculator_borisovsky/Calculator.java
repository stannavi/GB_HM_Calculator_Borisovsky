package calculator.calculation.gb_hm_calculator_borisovsky;

import android.os.Parcel;
import android.os.Parcelable;

public class Calculator implements Parcelable {

    private int num_0 = 0;
    private int num_1 = 1;
    private int num_2 = 2;
    private int num_3 = 3;
    private int num_4 = 4;
    private int num_5 = 5;
    private int num_6 = 6;
    private int num_7 = 7;
    private int num_8 = 8;
    private int num_9 = 9;

    private char plus = '+';
    private char minus = '-';
    private char multiply = '*';
    private char divide = '/';
    private char percent = '%';
    private char point = '.';
    private char equal = '=';
    private char reset = 'C';
    private char delete = 'D';

    protected Calculator(Parcel in) {
        num_0 = in.readInt();
        num_1 = in.readInt();
        num_2 = in.readInt();
        num_3 = in.readInt();
        num_4 = in.readInt();
        num_5 = in.readInt();
        num_6 = in.readInt();
        num_7 = in.readInt();
        num_8 = in.readInt();
        num_9 = in.readInt();
        plus = (char) in.readInt();
        minus = (char) in.readInt();
        multiply = (char) in.readInt();
        divide = (char) in.readInt();
        percent = (char) in.readInt();
        point = (char) in.readInt();
        equal = (char) in.readInt();
        reset = (char) in.readInt();
        delete = (char) in.readInt();
    }

    public static final Creator<Calculator> CREATOR = new Creator<Calculator>() {
        @Override
        public Calculator createFromParcel(Parcel in) {
            return new Calculator(in);
        }

        @Override
        public Calculator[] newArray(int size) {
            return new Calculator[size];
        }
    };

    public Calculator() {

    }

    public void setDelete(char delete) {
        this.delete = delete;
    }

    public char getDelete() {
        return delete;
    }

    public void setNum_0(int num_0) {
        this.num_0 = num_0;
    }

    public void setNum_1(int num_1) {
        this.num_1 = num_1;
    }

    public void setNum_2(int num_2) {
        this.num_2 = num_2;
    }

    public void setNum_3(int num_3) {
        this.num_3 = num_3;
    }

    public void setNum_4(int num_4) {
        this.num_4 = num_4;
    }

    public void setNum_5(int num_5) {
        this.num_5 = num_5;
    }

    public void setNum_6(int num_6) {
        this.num_6 = num_6;
    }

    public void setNum_7(int num_7) {
        this.num_7 = num_7;
    }

    public void setNum_8(int num_8) {
        this.num_8 = num_8;
    }

    public void setNum_9(int num_9) {
        this.num_9 = num_9;
    }

    public void setPlus(char plus) {
        this.plus = plus;
    }

    public void setMinus(char minus) {
        this.minus = minus;
    }

    public void setMultiply(char multiply) {
        this.multiply = multiply;
    }

    public void setDivide(char divide) {
        this.divide = divide;
    }

    public void setPercent(char percent) {
        this.percent = percent;
    }

    public void setPoint(char point) {
        this.point = point;
    }

    public void setEqual(char equal) {
        this.equal = equal;
    }

    public void setReset(char reset) {
        this.reset = reset;
    }

    public int getNum_0() {
        return num_0;
    }

    public int getNum_1() {
        return num_1;
    }

    public int getNum_2() {
        return num_2;
    }

    public int getNum_3() {
        return num_3;
    }

    public int getNum_4() {
        return num_4;
    }

    public int getNum_5() {
        return num_5;
    }

    public int getNum_6() {
        return num_6;
    }

    public int getNum_7() {
        return num_7;
    }

    public int getNum_8() {
        return num_8;
    }

    public int getNum_9() {
        return num_9;
    }

    public char getPlus() {
        return plus;
    }

    public char getMinus() {
        return minus;
    }

    public char getMultiply() {
        return multiply;
    }

    public char getDivide() {
        return divide;
    }

    public char getPercent() {
        return percent;
    }

    public char getPoint() {
        return point;
    }

    public char getEqual() {
        return equal;
    }

    public char getReset() {
        return reset;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(num_0);
        dest.writeInt(num_1);
        dest.writeInt(num_2);
        dest.writeInt(num_3);
        dest.writeInt(num_4);
        dest.writeInt(num_5);
        dest.writeInt(num_6);
        dest.writeInt(num_7);
        dest.writeInt(num_8);
        dest.writeInt(num_9);
        dest.writeInt((int) plus);
        dest.writeInt((int) minus);
        dest.writeInt((int) multiply);
        dest.writeInt((int) divide);
        dest.writeInt((int) percent);
        dest.writeInt((int) point);
        dest.writeInt((int) equal);
        dest.writeInt((int) reset);
        dest.writeInt((int) delete);
    }
}
