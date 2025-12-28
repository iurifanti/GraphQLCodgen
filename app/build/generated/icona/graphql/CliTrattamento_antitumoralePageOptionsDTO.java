package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Options to configure the list of elements to be returned by a Trattamento_antitumoralePage.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTrattamento_antitumoralePageOptionsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliTrattamento_antitumoraleFilterDTO filter;
    private String filter_exp;
    private Integer offset;
    private String cursor;
    private CliTrattamento_antitumoraleCursorDTO fromCursor;
    private Integer next;
    private Integer prev;
    private java.util.List<CliTrattamento_antitumoraleSortDTO> orderBy = java.util.Arrays.asList(CliTrattamento_antitumoraleSortDTO._id___ASC);

    public CliTrattamento_antitumoralePageOptionsDTO() {
    }


    public CliTrattamento_antitumoraleFilterDTO getFilter() {
        return filter;
    }
    public void setFilter(CliTrattamento_antitumoraleFilterDTO filter) {
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

    public CliTrattamento_antitumoraleCursorDTO getFromCursor() {
        return fromCursor;
    }
    public void setFromCursor(CliTrattamento_antitumoraleCursorDTO fromCursor) {
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

    public java.util.List<CliTrattamento_antitumoraleSortDTO> getOrderBy() {
        return orderBy;
    }
    public void setOrderBy(java.util.List<CliTrattamento_antitumoraleSortDTO> orderBy) {
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

    public static CliTrattamento_antitumoralePageOptionsDTO.Builder builder() {
        return new CliTrattamento_antitumoralePageOptionsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliTrattamento_antitumoraleFilterDTO filter;
        private String filter_exp;
        private Integer offset;
        private String cursor;
        private CliTrattamento_antitumoraleCursorDTO fromCursor;
        private Integer next;
        private Integer prev;
        private java.util.List<CliTrattamento_antitumoraleSortDTO> orderBy = java.util.Arrays.asList(CliTrattamento_antitumoraleSortDTO._id___ASC);

        public Builder() {
        }

        public Builder setFilter(CliTrattamento_antitumoraleFilterDTO filter) {
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

        public Builder setFromCursor(CliTrattamento_antitumoraleCursorDTO fromCursor) {
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

        public Builder setOrderBy(java.util.List<CliTrattamento_antitumoraleSortDTO> orderBy) {
            this.orderBy = orderBy;
            return this;
        }


        public CliTrattamento_antitumoralePageOptionsDTO build() {
            CliTrattamento_antitumoralePageOptionsDTO result = new CliTrattamento_antitumoralePageOptionsDTO();
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
