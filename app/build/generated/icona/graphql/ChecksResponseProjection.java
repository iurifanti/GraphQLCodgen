package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Checks
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ChecksResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ChecksResponseProjection() {
    }

    public ChecksResponseProjection(ChecksResponseProjection projection) {
        super(projection);
    }

    public ChecksResponseProjection(List<ChecksResponseProjection> projections) {
        super(projections);
    }

    public ChecksResponseProjection all$() {
        return all$(3);
    }

    public ChecksResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.check_id();
        this.codice_centro_h();
        this.codice_centro_i();
        this.codice_hepa();
        this.codice_ico();
        this.descrizione();
        this.note();
        this.risolto();
        this.specifiche();
        if (projectionDepthOnFields.getOrDefault("ChecksResponseProjection.H_PazientePageResponseProjection.h_Paziente____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChecksResponseProjection.H_PazientePageResponseProjection.h_Paziente____associables", projectionDepthOnFields.getOrDefault("ChecksResponseProjection.H_PazientePageResponseProjection.h_Paziente____associables", 0) + 1);
            this.h_Paziente____associables(new H_PazientePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChecksResponseProjection.H_PazientePageResponseProjection.h_Paziente____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ChecksResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChecksResponseProjection.H_PazienteResponseProjection.h_Paziente_", projectionDepthOnFields.getOrDefault("ChecksResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) + 1);
            this.h_Paziente_(new H_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChecksResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ChecksResponseProjection.O_PazientePageResponseProjection.o_paziente____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChecksResponseProjection.O_PazientePageResponseProjection.o_paziente____associables", projectionDepthOnFields.getOrDefault("ChecksResponseProjection.O_PazientePageResponseProjection.o_paziente____associables", 0) + 1);
            this.o_paziente____associables(new O_PazientePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChecksResponseProjection.O_PazientePageResponseProjection.o_paziente____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ChecksResponseProjection.O_PazienteResponseProjection.o_paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChecksResponseProjection.O_PazienteResponseProjection.o_paziente_", projectionDepthOnFields.getOrDefault("ChecksResponseProjection.O_PazienteResponseProjection.o_paziente_", 0) + 1);
            this.o_paziente_(new O_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChecksResponseProjection.O_PazienteResponseProjection.o_paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ChecksResponseProjection.PazientePageResponseProjection.paziente____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChecksResponseProjection.PazientePageResponseProjection.paziente____associables", projectionDepthOnFields.getOrDefault("ChecksResponseProjection.PazientePageResponseProjection.paziente____associables", 0) + 1);
            this.paziente____associables(new PazientePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChecksResponseProjection.PazientePageResponseProjection.paziente____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ChecksResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChecksResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("ChecksResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChecksResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public ChecksResponseProjection _clientId() {
        return _clientId(null);
    }

    public ChecksResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public ChecksResponseProjection _id() {
        return _id(null);
    }

    public ChecksResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public ChecksResponseProjection check_id() {
        return check_id(null);
    }

    public ChecksResponseProjection check_id(String alias) {
        add$(new GraphQLResponseField("check_id").alias(alias));
        return this;
    }

    public ChecksResponseProjection codice_centro_h() {
        return codice_centro_h(null);
    }

    public ChecksResponseProjection codice_centro_h(String alias) {
        add$(new GraphQLResponseField("codice_centro_h").alias(alias));
        return this;
    }

    public ChecksResponseProjection codice_centro_i() {
        return codice_centro_i(null);
    }

    public ChecksResponseProjection codice_centro_i(String alias) {
        add$(new GraphQLResponseField("codice_centro_i").alias(alias));
        return this;
    }

    public ChecksResponseProjection codice_hepa() {
        return codice_hepa(null);
    }

    public ChecksResponseProjection codice_hepa(String alias) {
        add$(new GraphQLResponseField("codice_hepa").alias(alias));
        return this;
    }

    public ChecksResponseProjection codice_ico() {
        return codice_ico(null);
    }

    public ChecksResponseProjection codice_ico(String alias) {
        add$(new GraphQLResponseField("codice_ico").alias(alias));
        return this;
    }

    public ChecksResponseProjection descrizione() {
        return descrizione(null);
    }

    public ChecksResponseProjection descrizione(String alias) {
        add$(new GraphQLResponseField("descrizione").alias(alias));
        return this;
    }

    public ChecksResponseProjection note() {
        return note(null);
    }

    public ChecksResponseProjection note(String alias) {
        add$(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public ChecksResponseProjection risolto() {
        return risolto(null);
    }

    public ChecksResponseProjection risolto(String alias) {
        add$(new GraphQLResponseField("risolto").alias(alias));
        return this;
    }

    public ChecksResponseProjection specifiche() {
        return specifiche(null);
    }

    public ChecksResponseProjection specifiche(String alias) {
        add$(new GraphQLResponseField("specifiche").alias(alias));
        return this;
    }

    public ChecksResponseProjection h_Paziente____associables(H_PazientePageResponseProjection subProjection) {
        return h_Paziente____associables((String)null, subProjection);
    }

    public ChecksResponseProjection h_Paziente____associables(String alias, H_PazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("h_Paziente____associables").alias(alias).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection h_Paziente____associables(ChecksH_Paziente____associablesParametrizedInput input, H_PazientePageResponseProjection subProjection) {
        return h_Paziente____associables(null, input, subProjection);
    }

    public ChecksResponseProjection h_Paziente____associables(String alias, ChecksH_Paziente____associablesParametrizedInput input, H_PazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("h_Paziente____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection h_Paziente_(H_PazienteResponseProjection subProjection) {
        return h_Paziente_(null, subProjection);
    }

    public ChecksResponseProjection h_Paziente_(String alias, H_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("h_Paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection o_paziente____associables(O_PazientePageResponseProjection subProjection) {
        return o_paziente____associables((String)null, subProjection);
    }

    public ChecksResponseProjection o_paziente____associables(String alias, O_PazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("o_paziente____associables").alias(alias).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection o_paziente____associables(ChecksO_paziente____associablesParametrizedInput input, O_PazientePageResponseProjection subProjection) {
        return o_paziente____associables(null, input, subProjection);
    }

    public ChecksResponseProjection o_paziente____associables(String alias, ChecksO_paziente____associablesParametrizedInput input, O_PazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("o_paziente____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection o_paziente_(O_PazienteResponseProjection subProjection) {
        return o_paziente_(null, subProjection);
    }

    public ChecksResponseProjection o_paziente_(String alias, O_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("o_paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection paziente____associables(PazientePageResponseProjection subProjection) {
        return paziente____associables((String)null, subProjection);
    }

    public ChecksResponseProjection paziente____associables(String alias, PazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente____associables").alias(alias).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection paziente____associables(ChecksPaziente____associablesParametrizedInput input, PazientePageResponseProjection subProjection) {
        return paziente____associables(null, input, subProjection);
    }

    public ChecksResponseProjection paziente____associables(String alias, ChecksPaziente____associablesParametrizedInput input, PazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public ChecksResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public ChecksResponseProjection typename() {
        return typename(null);
    }

    public ChecksResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ChecksResponseProjection deepCopy$() {
        return new ChecksResponseProjection(this);
    }


}
