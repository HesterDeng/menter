package dto;

/**
 * Created by Esther on 2016/9/6.
 */
public class Page {
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    private int limit;
    private int offset;
    private String search;
    private String order;

    @Override
    public String toString() {
        return "Page{" +
                "limit=" + limit +
                ", offset=" + offset +
                ", search='" + search + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}
