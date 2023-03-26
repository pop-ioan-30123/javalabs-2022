package isp.lab5.exercise3;

interface Playable {

    void play();
}

class ColorVideo implements Playable {

    private String fileName;

    public ColorVideo(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading video..." + fileName);
    }
}

class BlackAndWhiteVideo implements Playable {

    private String fileName;

    public BlackAndWhiteVideo(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Play black and white video " + fileName);
    }
}

class ProxyVideo implements Playable {

    private ColorVideo video1;
    private BlackAndWhiteVideo video2;
    private char color;
    private String fileName;

    public ProxyVideo(String fileName, char color) {
        this.fileName = fileName;
        this.color = color;
    }

    @Override
    public void play() {
        if (color == 'b') {
            if (video2 == null) {
                video2 = new BlackAndWhiteVideo(fileName);
            }
            video2.play();

        } else if (this.color == 'c') {
            if (video1 == null) {
                video1 = new ColorVideo(fileName);
            }
            video1.play();
        }
    }
}

public class Exercise3 {
    
    public static void main(String[] args) {
    ColorVideo video1= new ColorVideo("Spider-Man");
    video1.play();
    BlackAndWhiteVideo video2=new BlackAndWhiteVideo("Stan si Bran");
    video2.play();
    ProxyVideo video3=new ProxyVideo("Det. Murdock", 'b');
    video3.play();
    ProxyVideo video4=new ProxyVideo("Det. Murdock", 'c');
    video4.play();
}
}
