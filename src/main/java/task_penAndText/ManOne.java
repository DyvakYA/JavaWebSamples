package task_penAndText;

/**
 * Created by Dyvak on 13.12.2016.
 */
public class ManOne {
    public static void main(String[] args) {

        Pen pen = new PenImpl();
        pen.ready();

        Text text = new TextImpl();
        text.setTextString("Get your ass and go away");

        Paper paper = new PaperImpl();
        paper.setFormat(PaperFormat.A4);

        Writer writer = new WriterBuilder()
                .buildPen(pen)
                .buildText(text)
                .buildPaper(paper)
                .build();
        System.out.println(writer);


    }
}

interface Man{
}

class Writer implements Man{
    Pen pen;
    Text text;
    Paper paper;

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "pen=" + pen +
                ", text=" + text +
                ", paper=" + paper +
                '}';
    }
}

class WriterBuilder {

    Pen pen;
    Text text;
    Paper paper;

    WriterBuilder buildPen(Pen pen){
        this.pen = pen;
        return this;
    }

    WriterBuilder buildText(Text text){
        this.text = text;
        return this;
    }

    WriterBuilder buildPaper(Paper paper){
        this.paper = paper;
        return this;
    }

    Writer build(){
        Writer writer = new Writer();
        writer.setPen(pen);
        writer.setText(text);
        writer.setPaper(paper);
        return writer;
    }
}

interface Text{
    public void setTextString(String textString);
}

class TextImpl implements Text{
    private String textString;

    public void setTextString(String textString) {
        this.textString = textString;
    }

    @Override
    public String toString() {
        return "Text{" +
                "textString='" + textString + '\'' +
                '}';
    }
}

interface Pen{
    void ready();
}

class PenImpl implements Pen {

    @Override
    public void ready() {
        System.out.println("Pen ready to write");
    }

    @Override
    public String toString() {
        return "Pen ready to write";
    }
}

interface Paper {
    public void setFormat(PaperFormat format);
}

class PaperImpl implements Paper{
    private PaperFormat format;

    public void setFormat(PaperFormat format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "format=" + format +
                '}';
    }
}

enum PaperFormat{
    A4, A5
}




