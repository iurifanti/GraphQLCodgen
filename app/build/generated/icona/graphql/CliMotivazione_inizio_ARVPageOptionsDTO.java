package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Options to configure the list of elements to be returned by a Motivazione_inizio_ARVPage.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMotivazione_inizio_ARVPageOptionsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliMotivazione_inizio_ARVFilterDTO filter;
    private String filter_exp;
    private Integer offset;
    private String cursor;
    private CliMotivazione_inizio_ARVCursorDTO fromCursor;
    private Integer next;
    private Integer prev;
    private java.util.List<CliMotivazione_inizio_ARVSortDTO> orderBy = java.util.Arrays.asList(CliMotivazione_inizio_ARVSortDTO._id___ASC);

    public CliMotivazione_inizio_ARVPageOptionsDTO() {
    }


    public CliMotivazione_inizio_ARVFilterDTO getFilter() {
        return filter;
    }
    public void setFilter(CliMotivazione_inizio_ARVFilterDTO filter) {
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

    public CliMotivazione_inizio_ARVCursorDTO getFromCursor() {
        return fromCursor;
    }
    public void setFromCursor(CliMotivazione_inizio_ARVCursorDTO fromCursor) {
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

    public java.util.List<CliMotivazione_inizio_ARVSortDTO> getOrderBy() {
        return orderBy;
    }
    public void setOrderBy(java.util.List<CliMotivazione_inizio_ARVSortDTO> orderBy) {
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

    public static CliMotivazione_inizio_ARVPageOptionsDTO.Builder builder() {
        return new CliMotivazione_inizio_ARVPageOptionsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private CliMotivazione_inizio_ARVFilterDTO filter;
        private String filter_exp;
        private Integer offset;
        private String cursor;
        private CliMotivazione_inizio_ARVCursorDTO fromCursor;
        private Integer next;
        private Integer prev;
        private java.util.List<CliMotivazione_inizio_ARVSortDTO> orderBy = java.util.Arrays.asList(CliMotivazione_inizio_ARVSortDTO._id___ASC);

        public Builder() {
        }

        public Builder setFilter(CliMotivazione_inizio_ARVFilterDTO filter) {
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

        public Builder setFromCursor(CliMotivazione_inizio_ARVCursorDTO fromCursor) {
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

        public Builder setOrderBy(java.util.List<CliMotivazione_inizio_ARVSortDTO> orderBy) {
            this.orderBy = orderBy;
            return this;
        }


        public CliMotivazione_inizio_ARVPageOptionsDTO build() {
            CliMotivazione_inizio_ARVPageOptionsDTO result = new CliMotivazione_inizio_ARVPageOptionsDTO();
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
