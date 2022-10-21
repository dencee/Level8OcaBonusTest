package part2.q4;

public class Image {
    public int width, height;

    public void showImage() throws Exception {
        if (width < 0 || height < 0)
            throw new Exception("invalid image size");
        else
            System.out.print("1");
    }

    public static void main(String[] args) {
        Image image = new Image();
        image.width = -10;

        try {
            image.showImage();
            System.out.print("2");
        } catch (Exception e) {
            System.out.print("3");
        }

        System.out.print("4");
    }
}