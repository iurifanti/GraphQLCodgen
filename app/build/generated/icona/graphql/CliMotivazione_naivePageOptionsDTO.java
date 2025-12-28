package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Options to configure the list of elements to be returned by a Motivazione_naivePage.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMotivazione_naivePageOptionsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliMotivazione_naiveFilterDTO filter;
    private String filter_exp;
    private Integer offset;
    private String cursor;
    private CliMotivazione_naiveCursorDTO fromCursor;
    private Integer next;
    private Integer prev;
    private java.util.List<CliMotivazione_naiveSortDTO> orderBy = java.util.Arrays.asList(CliMotivazione_naiveSortDTO._id___ASC);

    public CliMotivazione_naivePageOptionsDTO() {
    }


    public CliMotivazione_naiveFilterDTO getFilter() {
        return filter;
    }
    public void setFilter(CliMotivazione_naiveFilterDTO filter) {
        this.filter = filter;
    }

    public String getFilter_exp() {
        return filter_exp;
    }
    public void setFilter_exp(String filter_exp) {
        this.filter_exp = filter_exp;
    }

    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CliMotivazione_naiveCursorDTO getFromCursor() {
        return fromCursor;
    }
    public void setFromCursor(CliMotivazione_naiveCursorDTO fromCursor) {
        this.fromCursor = fromCursor;
    }

    public Integer getNext() {
        return next;
    }
    public void setNext(Integer next) {
        this.next = next;
    }

    public Integer getPrev() {
        return prev;
    }
    public void setPrev(Integer prev) {
        this.prev = prev;
    }

    public java.util.List<CliMotivazione_naiveSortDTO> getOrderBy() {
        return orderBy;
    }
    public void setOrderBy(java.util.List<CliMotivazione_naiveSortDTO> orderBy) {
        this.orderBy = orderBy;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        if (filter_exp != null) {
            joiner.add("filter_exp: " + GraphQLRequestSerializer.getEntry(filter_exp));
        }
        if (offset != null) {
            joiner.add("offset: " + GraphQLRequestSerializer.getEntry(offset));
        }
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (fromCursor != null) {
            joiner.add("fromCursor: " + GraphQLRequestSerializer.getEntry(fromCursor));
        }
        if (next != null) {
            joiner.add("next: " + GraphQLRequestSerializer.getEntry(next));
        }
        if (prev != null) {
            joiner.add("prev: " + GraphQLRequestSerializer.getEntry(prev));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        return joiner.toString();
    }

    public static CliMotivazione_naivePageOptionsDTO.Builder builder() {
        return new CliMotivazione_naivePageOptionsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliMotivazione_naiveFilterDTO filter;
        private String filter_exp;
        private Integer offset;
        private String cursor;
        private CliMotivazione_naiveCursorDTO fromCursor;
        private Integer next;
        private Integer prev;
        private java.util.List<CliMotivazione_naiveSortDTO> orderBy = java.util.Arrays.asList(CliMotivazione_naiveSortDTO._id___ASC);

        public Builder() {
        }

        public Builder setFilter(CliMotivazione_naiveFilterDTO filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter_exp(String filter_exp) {
            this.filter_exp = filter_exp;
            return this;
        }

        public Builder setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setFromCursor(CliMotivazione_naiveCursorDTO fromCursor) {
            this.fromCursor = fromCursor;
            return this;
        }

        public Builder setNext(Integer next) {
            this.next = next;
            return this;
        }

        public Builder setPrev(Integer prev) {
            this.prev = prev;
            return this;
        }

        public Builder setOrderBy(java.util.List<CliMotivazione_naiveSortDTO> orderBy) {
            this.orderBy = orderBy;
            return this;
        }


        public CliMotivazione_naivePageOptionsDTO build() {
            CliMotivazione_naivePageOptionsDTO result = new CliMotivazione_naivePageOptionsDTO();
            result.setFilter(this.filter);
            result.setFilter_exp(this.filter_exp);
            result.setOffset(this.offset);
            result.setCursor(this.cursor);
            result.setFromCursor(this.fromCursor);
            result.setNext(this.next);
            result.setPrev(this.prev);
            result.setOrderBy(this.orderBy);
            return result;
        }

    }
}
