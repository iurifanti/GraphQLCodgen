package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_altro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_altroResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_altroResponseProjection() {
    }

    public Farmaco_altroResponseProjection(Farmaco_altroResponseProjection projection) {
        super(projection);
    }

    public Farmaco_altroResponseProjection(List<Farmaco_altroResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_altroResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_altroResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.anche_da_solo();
        this.codice_DAD();
        this.combinazioni_accettate();
        this.gruppo();
        this.nome();
        this.nome_gruppo();
        this.nome_tipo();
        this.sottogruppo();
        this.tag();
        this.tipo();
        this.vaccino_covid();
        this.vaccino_non_covid();
        if (projectionDepthOnFields.getOrDefault("Farmaco_altroResponseProjection.Combinazioni_accettate_non_ARVPageResponseProjection.combinazioni_accettate_non_ARV____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_altroResponseProjection.Combinazioni_accettate_non_ARVPageResponseProjection.combinazioni_accettate_non_ARV____associables", projectionDepthOnFields.getOrDefault("Farmaco_altroResponseProjection.Combinazioni_accettate_non_ARVPageResponseProjection.combinazioni_accettate_non_ARV____associables", 0) + 1);
            this.combinazioni_accettate_non_ARV____associables(new Combinazioni_accettate_non_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_altroResponseProjection.Combinazioni_accettate_non_ARVPageResponseProjection.combinazioni_accettate_non_ARV____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_altroResponseProjection.Combinazioni_accettate_non_ARVPageResponseProjection.combinazioni_accettate_non_ARV_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_altroResponseProjection.Combinazioni_accettate_non_ARVPageResponseProjection.combinazioni_accettate_non_ARV_", projectionDepthOnFields.getOrDefault("Farmaco_altroResponseProjection.Combinazioni_accettate_non_ARVPageResponseProjection.combinazioni_accettate_non_ARV_", 0) + 1);
            this.combinazioni_accettate_non_ARV_(new Combinazioni_accettate_non_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_altroResponseProjection.Combinazioni_accettate_non_ARVPageResponseProjection.combinazioni_accettate_non_ARV_", 0)));
        }
        this.typename();
        return this;
    }

    public Farmaco_altroResponseProjection _clientId() {
        return _clientId(null);
    }

    public Farmaco_altroResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection _id() {
        return _id(null);
    }

    public Farmaco_altroResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection anche_da_solo() {
        return anche_da_solo(null);
    }

    public Farmaco_altroResponseProjection anche_da_solo(String alias) {
        add$(new GraphQLResponseField("anche_da_solo").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Farmaco_altroResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection combinazioni_accettate() {
        return combinazioni_accettate(null);
    }

    public Farmaco_altroResponseProjection combinazioni_accettate(String alias) {
        add$(new GraphQLResponseField("combinazioni_accettate").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection gruppo() {
        return gruppo(null);
    }

    public Farmaco_altroResponseProjection gruppo(String alias) {
        add$(new GraphQLResponseField("gruppo").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection nome() {
        return nome(null);
    }

    public Farmaco_altroResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection nome_gruppo() {
        return nome_gruppo(null);
    }

    public Farmaco_altroResponseProjection nome_gruppo(String alias) {
        add$(new GraphQLResponseField("nome_gruppo").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection nome_tipo() {
        return nome_tipo(null);
    }

    public Farmaco_altroResponseProjection nome_tipo(String alias) {
        add$(new GraphQLResponseField("nome_tipo").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection sottogruppo() {
        return sottogruppo(null);
    }

    public Farmaco_altroResponseProjection sottogruppo(String alias) {
        add$(new GraphQLResponseField("sottogruppo").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection tag() {
        return tag(null);
    }

    public Farmaco_altroResponseProjection tag(String alias) {
        add$(new GraphQLResponseField("tag").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection tipo() {
        return tipo(null);
    }

    public Farmaco_altroResponseProjection tipo(String alias) {
        add$(new GraphQLResponseField("tipo").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection vaccino_covid() {
        return vaccino_covid(null);
    }

    public Farmaco_altroResponseProjection vaccino_covid(String alias) {
        add$(new GraphQLResponseField("vaccino_covid").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection vaccino_non_covid() {
        return vaccino_non_covid(null);
    }

    public Farmaco_altroResponseProjection vaccino_non_covid(String alias) {
        add$(new GraphQLResponseField("vaccino_non_covid").alias(alias));
        return this;
    }

    public Farmaco_altroResponseProjection combinazioni_accettate_non_ARV____associables(Combinazioni_accettate_non_ARVPageResponseProjection subProjection) {
        return combinazioni_accettate_non_ARV____associables((String)null, subProjection);
    }

    public Farmaco_altroResponseProjection combinazioni_accettate_non_ARV____associables(String alias, Combinazioni_accettate_non_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("combinazioni_accettate_non_ARV____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_altroResponseProjection combinazioni_accettate_non_ARV____associables(Farmaco_altroCombinazioni_accettate_non_ARV____associablesParametrizedInput input, Combinazioni_accettate_non_ARVPageResponseProjection subProjection) {
        return combinazioni_accettate_non_ARV____associables(null, input, subProjection);
    }

    public Farmaco_altroResponseProjection combinazioni_accettate_non_ARV____associables(String alias, Farmaco_altroCombinazioni_accettate_non_ARV____associablesParametrizedInput input, Combinazioni_accettate_non_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("combinazioni_accettate_non_ARV____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_altroResponseProjection combinazioni_accettate_non_ARV_(Combinazioni_accettate_non_ARVPageResponseProjection subProjection) {
        return combinazioni_accettate_non_ARV_((String)null, subProjection);
    }

    public Farmaco_altroResponseProjection combinazioni_accettate_non_ARV_(String alias, Combinazioni_accettate_non_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("combinazioni_accettate_non_ARV_").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_altroResponseProjection combinazioni_accettate_non_ARV_(Farmaco_altroCombinazioni_accettate_non_ARV_ParametrizedInput input, Combinazioni_accettate_non_ARVPageResponseProjection subProjection) {
        return combinazioni_accettate_non_ARV_(null, input, subProjection);
    }

    public Farmaco_altroResponseProjection combinazioni_accettate_non_ARV_(String alias, Farmaco_altroCombinazioni_accettate_non_ARV_ParametrizedInput input, Combinazioni_accettate_non_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("combinazioni_accettate_non_ARV_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_altroResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_altroResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_altroResponseProjection deepCopy$() {
        return new Farmaco_altroResponseProjection(this);
    }


}
