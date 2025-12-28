package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents a collection of objects of class campione_old.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCampione_oldPageDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliCampione_oldDTO> items;
    private int totalCount;
    private String nextCursor;
    private String prevCursor;
    private boolean hasNext;
    private boolean hasPrev;

    public CliCampione_oldPageDTO() {
    }


    /**
     * An array containing the actual objects of class campione_old.
     */
    public java.util.List<CliCampione_oldDTO> getItems() {
        return items;
    }
    /**
     * An array containing the actual objects of class campione_old.
     */
    public void setItems(java.util.List<CliCampione_oldDTO> items) {
        this.items = items;
    }

    /**
     * The total number of objects of class campione_old present in the database.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total number of objects of class campione_old present in the database.
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * A cursor to the next object, used to iterate over the elements.
     */
    public String getNextCursor() {
        return nextCursor;
    }
    /**
     * A cursor to the next object, used to iterate over the elements.
     */
    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    /**
     * A cursor to the previous object, used to iterate over the elements in reverse order.
     */
    public String getPrevCursor() {
        return prevCursor;
    }
    /**
     * A cursor to the previous object, used to iterate over the elements in reverse order.
     */
    public void setPrevCursor(String prevCursor) {
        this.prevCursor = prevCursor;
    }

    /**
     * A boolean flag that indicates if there are more elements following the ones retrieved.
     */
    public boolean getHasNext() {
        return hasNext;
    }
    /**
     * A boolean flag that indicates if there are more elements following the ones retrieved.
     */
    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    /**
     * A boolean flag that indicates if there are elements preceding the ones retrieved.
     */
    public boolean getHasPrev() {
        return hasPrev;
    }
    /**
     * A boolean flag that indicates if there are elements preceding the ones retrieved.
     */
    public void setHasPrev(boolean hasPrev) {
        this.hasPrev = hasPrev;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (items != null) {
            joiner.add("items: " + GraphQLRequestSerializer.getEntry(items));
        }
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        if (nextCursor != null) {
            joiner.add("nextCursor: " + GraphQLRequestSerializer.getEntry(nextCursor));
        }
        if (prevCursor != null) {
            joiner.add("prevCursor: " + GraphQLRequestSerializer.getEntry(prevCursor));
        }
        joiner.add("hasNext: " + GraphQLRequestSerializer.getEntry(hasNext));
        joiner.add("hasPrev: " + GraphQLRequestSerializer.getEntry(hasPrev));
        return joiner.toString();
    }

    public static CliCampione_oldPageDTO.Builder builder() {
        return new CliCampione_oldPageDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliCampione_oldDTO> items;
        private int totalCount;
        private String nextCursor;
        private String prevCursor;
        private boolean hasNext;
        private boolean hasPrev;

        public Builder() {
        }

        /**
         * An array containing the actual objects of class campione_old.
         */
        public Builder setItems(java.util.List<CliCampione_oldDTO> items) {
            this.items = items;
            return this;
        }

        /**
         * The total number of objects of class campione_old present in the database.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A cursor to the next object, used to iterate over the elements.
         */
        public Builder setNextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * A cursor to the previous object, used to iterate over the elements in reverse order.
         */
        public Builder setPrevCursor(String prevCursor) {
            this.prevCursor = prevCursor;
            return this;
        }

        /**
         * A boolean flag that indicates if there are more elements following the ones retrieved.
         */
        public Builder setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        /**
         * A boolean flag that indicates if there are elements preceding the ones retrieved.
         */
        public Builder setHasPrev(boolean hasPrev) {
            this.hasPrev = hasPrev;
            return this;
        }


        public CliCampione_oldPageDTO build() {
            CliCampione_oldPageDTO result = new CliCampione_oldPageDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            result.setNextCursor(this.nextCursor);
            result.setPrevCursor(this.prevCursor);
            result.setHasNext(this.hasNext);
            result.setHasPrev(this.hasPrev);
            return result;
        }

    }
}
