package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents a collection of objects of class Metodica_genoma_HCV_HBV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMetodica_genoma_HCV_HBVPageDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliMetodica_genoma_HCV_HBVDTO> items;
    private int totalCount;
    private String nextCursor;
    private String prevCursor;
    private boolean hasNext;
    private boolean hasPrev;

    public CliMetodica_genoma_HCV_HBVPageDTO() {
    }


    /**
     * An array containing the actual objects of class Metodica_genoma_HCV_HBV.
     */
    public java.util.List<CliMetodica_genoma_HCV_HBVDTO> getItems() {
        return items;
    }
    /**
     * An array containing the actual objects of class Metodica_genoma_HCV_HBV.
     */
    public void setItems(java.util.List<CliMetodica_genoma_HCV_HBVDTO> items) {
        this.items = items;
    }

    /**
     * The total number of objects of class Metodica_genoma_HCV_HBV present in the database.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total number of objects of class Metodica_genoma_HCV_HBV present in the database.
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

    public static CliMetodica_genoma_HCV_HBVPageDTO.Builder builder() {
        return new CliMetodica_genoma_HCV_HBVPageDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliMetodica_genoma_HCV_HBVDTO> items;
        private int totalCount;
        private String nextCursor;
        private String prevCursor;
        private boolean hasNext;
        private boolean hasPrev;

        public Builder() {
        }

        /**
         * An array containing the actual objects of class Metodica_genoma_HCV_HBV.
         */
        public Builder setItems(java.util.List<CliMetodica_genoma_HCV_HBVDTO> items) {
            this.items = items;
            return this;
        }

        /**
         * The total number of objects of class Metodica_genoma_HCV_HBV present in the database.
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


        public CliMetodica_genoma_HCV_HBVPageDTO build() {
            CliMetodica_genoma_HCV_HBVPageDTO result = new CliMetodica_genoma_HCV_HBVPageDTO();
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
