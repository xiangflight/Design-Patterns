package zen.chapter06;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/10 7:05 下午
 */

public class NovelBook implements IBook {

    private String name;

    private int price;

    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
