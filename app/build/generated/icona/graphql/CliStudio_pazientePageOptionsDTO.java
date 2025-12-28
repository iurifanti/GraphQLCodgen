package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Options to configure the list of elements to be returned by a Studio_pazientePage.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliStudio_pazientePageOptionsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliStudio_pazienteFilterDTO filter;
    private String filter_exp;
    private Integer offset;
    private String cursor;
    private CliStudio_pazienteCursorDTO fromCursor;
    private Integer next;
    private Integer prev;
    private java.util.List<CliStudio_pazienteSortDTO> orderBy = java.util.Arrays.asList(CliStudio_pazienteSortDTO._id___ASC);

    public CliStudio_pazientePageOptionsDTO() {
    }


    public CliStudio_pazienteFilterDTO getFilter() {
        return filter;
    }
    public void setFilter(CliStudio_pazienteFilterDTO filter) {
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

    public CliStudio_pazienteCursorDTO getFromCursor() {
        return fromCursor;
    }
    public void setFromCursor(CliStudio_pazienteCursorDTO fromCursor) {
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

    public java.util.List<CliStudio_pazienteSortDTO> getOrderBy() {
        return orderBy;
    }
    public void setOrderBy(java.util.List<CliStudio_pazienteSortDTO> orderBy) {
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

    public static CliStudio_pazientePageOptionsDTO.Builder builder() {
        return new CliStudio_pazientePageOptionsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliStudio_pazienteFilterDTO filter;
        private String filter_exp;
        private Integer offset;
        private String cursor;
        private CliStudio_pazienteCursorDTO fromCursor;
        private Integer next;
        private Integer prev;
        private java.util.List<CliStudio_pazienteSortDTO> orderBy = java.util.Arrays.asList(CliStudio_pazienteSortDTO._id___ASC);

        public Builder() {
        }

        public Builder setFilter(CliStudio_pazienteFilterDTO filter) {
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

        public Builder setFromCursor(CliStudio_pazienteCursorDTO fromCursor) {
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

        public Builder setOrderBy(java.util.List<CliStudio_pazienteSortDTO> orderBy) {
            this.orderBy = orderBy;
            return this;
        }


        public CliStudio_pazientePageOptionsDTO build() {
            CliStudio_pazientePageOptionsDTO result = new CliStudio_pazientePageOptionsDTO();
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
