package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class Comorbidita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliComorbidita_mpvUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer ordine;

    public CliComorbidita_mpvUpdateBulkDTO() {
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrdine() {
        return ordine;
    }
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        return joiner.toString();
    }

    public static CliComorbidita_mpvUpdateBulkDTO.Builder builder() {
        return new CliComorbidita_mpvUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String name;
        private Integer ordine;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }


        public CliComorbidita_mpvUpdateBulkDTO build() {
            CliComorbidita_mpvUpdateBulkDTO result = new CliComorbidita_mpvUpdateBulkDTO();
            result.setName(this.name);
            result.setOrdine(this.ordine);
            return result;
        }

    }
}
