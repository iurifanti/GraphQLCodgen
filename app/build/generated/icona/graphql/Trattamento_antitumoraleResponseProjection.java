package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Trattamento_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Trattamento_antitumoraleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Trattamento_antitumoraleResponseProjection() {
    }

    public Trattamento_antitumoraleResponseProjection(Trattamento_antitumoraleResponseProjection projection) {
        super(projection);
    }

    public Trattamento_antitumoraleResponseProjection(List<Trattamento_antitumoraleResponseProjection> projections) {
        super(projections);
    }

    public Trattamento_antitumoraleResponseProjection all$() {
        return all$(3);
    }

    public Trattamento_antitumoraleResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altro();
        this.cellulare();
        this.chemioterapia();
        this.chirurgico();
        this.cicli_effettuati();
        this.cicli_previsti();
        this.data();
        this.data_fine();
        this.dose_gray_totale();
        this.farmaci_antitumorali();
        this.filtra_farmaci();
        this.immunoterapia();
        this.infezioni();
        this.linea();
        this.ormonale();
        this.radioterapia();
        this.risposta_trattamento();
        this.sepsi_severa();
        this.staminali();
        this.tipo_trattamento();
        this.tossicita_GI();
        this.tossicita_SNC();
        this.tossicita_anemia();
        this.tossicita_cardiaca();
        this.tossicita_epatica();
        this.tossicita_neutropenia();
        this.tossicita_piastrinopenia();
        if (projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale____associables", projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale____associables", 0) + 1);
            this.farmaco_antitumorale____associables(new Farmaco_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale_", projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale_", 0) + 1);
            this.farmaco_antitumorale_(new Farmaco_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Trattamento_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale____associables", projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale____associables", 0) + 1);
            this.tipo_trattamento_antitumorale____associables(new Tipo_trattamento_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Tipo_trattamento_antitumoraleResponseProjection.tipo_trattamento_antitumorale_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Trattamento_antitumoraleResponseProjection.Tipo_trattamento_antitumoraleResponseProjection.tipo_trattamento_antitumorale_", projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Tipo_trattamento_antitumoraleResponseProjection.tipo_trattamento_antitumorale_", 0) + 1);
            this.tipo_trattamento_antitumorale_(new Tipo_trattamento_antitumoraleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.Tipo_trattamento_antitumoraleResponseProjection.tipo_trattamento_antitumorale_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Trattamento_antitumoraleResponseProjection.H_PazienteResponseProjection.h_Paziente_", projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) + 1);
            this.h_Paziente_(new H_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.O_PazienteResponseProjection.o_paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Trattamento_antitumoraleResponseProjection.O_PazienteResponseProjection.o_paziente_", projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.O_PazienteResponseProjection.o_paziente_", 0) + 1);
            this.o_paziente_(new O_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.O_PazienteResponseProjection.o_paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Trattamento_antitumoraleResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Trattamento_antitumoraleResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Trattamento_antitumoraleResponseProjection _clientId() {
        return _clientId(null);
    }

    public Trattamento_antitumoraleResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection _id() {
        return _id(null);
    }

    public Trattamento_antitumoraleResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection altro() {
        return altro(null);
    }

    public Trattamento_antitumoraleResponseProjection altro(String alias) {
        add$(new GraphQLResponseField("altro").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection cellulare() {
        return cellulare(null);
    }

    public Trattamento_antitumoraleResponseProjection cellulare(String alias) {
        add$(new GraphQLResponseField("cellulare").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection chemioterapia() {
        return chemioterapia(null);
    }

    public Trattamento_antitumoraleResponseProjection chemioterapia(String alias) {
        add$(new GraphQLResponseField("chemioterapia").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection chirurgico() {
        return chirurgico(null);
    }

    public Trattamento_antitumoraleResponseProjection chirurgico(String alias) {
        add$(new GraphQLResponseField("chirurgico").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection cicli_effettuati() {
        return cicli_effettuati(null);
    }

    public Trattamento_antitumoraleResponseProjection cicli_effettuati(String alias) {
        add$(new GraphQLResponseField("cicli_effettuati").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection cicli_previsti() {
        return cicli_previsti(null);
    }

    public Trattamento_antitumoraleResponseProjection cicli_previsti(String alias) {
        add$(new GraphQLResponseField("cicli_previsti").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection data() {
        return data(null);
    }

    public Trattamento_antitumoraleResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection data_fine() {
        return data_fine(null);
    }

    public Trattamento_antitumoraleResponseProjection data_fine(String alias) {
        add$(new GraphQLResponseField("data_fine").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection dose_gray_totale() {
        return dose_gray_totale(null);
    }

    public Trattamento_antitumoraleResponseProjection dose_gray_totale(String alias) {
        add$(new GraphQLResponseField("dose_gray_totale").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection farmaci_antitumorali() {
        return farmaci_antitumorali(null);
    }

    public Trattamento_antitumoraleResponseProjection farmaci_antitumorali(String alias) {
        add$(new GraphQLResponseField("farmaci_antitumorali").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection filtra_farmaci() {
        return filtra_farmaci(null);
    }

    public Trattamento_antitumoraleResponseProjection filtra_farmaci(String alias) {
        add$(new GraphQLResponseField("filtra_farmaci").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection immunoterapia() {
        return immunoterapia(null);
    }

    public Trattamento_antitumoraleResponseProjection immunoterapia(String alias) {
        add$(new GraphQLResponseField("immunoterapia").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection infezioni() {
        return infezioni(null);
    }

    public Trattamento_antitumoraleResponseProjection infezioni(String alias) {
        add$(new GraphQLResponseField("infezioni").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection linea() {
        return linea(null);
    }

    public Trattamento_antitumoraleResponseProjection linea(String alias) {
        add$(new GraphQLResponseField("linea").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection ormonale() {
        return ormonale(null);
    }

    public Trattamento_antitumoraleResponseProjection ormonale(String alias) {
        add$(new GraphQLResponseField("ormonale").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection radioterapia() {
        return radioterapia(null);
    }

    public Trattamento_antitumoraleResponseProjection radioterapia(String alias) {
        add$(new GraphQLResponseField("radioterapia").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection risposta_trattamento() {
        return risposta_trattamento(null);
    }

    public Trattamento_antitumoraleResponseProjection risposta_trattamento(String alias) {
        add$(new GraphQLResponseField("risposta_trattamento").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection sepsi_severa() {
        return sepsi_severa(null);
    }

    public Trattamento_antitumoraleResponseProjection sepsi_severa(String alias) {
        add$(new GraphQLResponseField("sepsi_severa").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection staminali() {
        return staminali(null);
    }

    public Trattamento_antitumoraleResponseProjection staminali(String alias) {
        add$(new GraphQLResponseField("staminali").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tipo_trattamento() {
        return tipo_trattamento(null);
    }

    public Trattamento_antitumoraleResponseProjection tipo_trattamento(String alias) {
        add$(new GraphQLResponseField("tipo_trattamento").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tossicita_GI() {
        return tossicita_GI(null);
    }

    public Trattamento_antitumoraleResponseProjection tossicita_GI(String alias) {
        add$(new GraphQLResponseField("tossicita_GI").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tossicita_SNC() {
        return tossicita_SNC(null);
    }

    public Trattamento_antitumoraleResponseProjection tossicita_SNC(String alias) {
        add$(new GraphQLResponseField("tossicita_SNC").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tossicita_anemia() {
        return tossicita_anemia(null);
    }

    public Trattamento_antitumoraleResponseProjection tossicita_anemia(String alias) {
        add$(new GraphQLResponseField("tossicita_anemia").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tossicita_cardiaca() {
        return tossicita_cardiaca(null);
    }

    public Trattamento_antitumoraleResponseProjection tossicita_cardiaca(String alias) {
        add$(new GraphQLResponseField("tossicita_cardiaca").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tossicita_epatica() {
        return tossicita_epatica(null);
    }

    public Trattamento_antitumoraleResponseProjection tossicita_epatica(String alias) {
        add$(new GraphQLResponseField("tossicita_epatica").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tossicita_neutropenia() {
        return tossicita_neutropenia(null);
    }

    public Trattamento_antitumoraleResponseProjection tossicita_neutropenia(String alias) {
        add$(new GraphQLResponseField("tossicita_neutropenia").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tossicita_piastrinopenia() {
        return tossicita_piastrinopenia(null);
    }

    public Trattamento_antitumoraleResponseProjection tossicita_piastrinopenia(String alias) {
        add$(new GraphQLResponseField("tossicita_piastrinopenia").alias(alias));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection farmaco_antitumorale____associables(Farmaco_antitumoralePageResponseProjection subProjection) {
        return farmaco_antitumorale____associables((String)null, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection farmaco_antitumorale____associables(String alias, Farmaco_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_antitumorale____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection farmaco_antitumorale____associables(Trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput input, Farmaco_antitumoralePageResponseProjection subProjection) {
        return farmaco_antitumorale____associables(null, input, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection farmaco_antitumorale____associables(String alias, Trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput input, Farmaco_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_antitumorale____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection farmaco_antitumorale_(Farmaco_antitumoralePageResponseProjection subProjection) {
        return farmaco_antitumorale_((String)null, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection farmaco_antitumorale_(String alias, Farmaco_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_antitumorale_").alias(alias).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection farmaco_antitumorale_(Trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput input, Farmaco_antitumoralePageResponseProjection subProjection) {
        return farmaco_antitumorale_(null, input, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection farmaco_antitumorale_(String alias, Trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput input, Farmaco_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_antitumorale_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tipo_trattamento_antitumorale____associables(Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        return tipo_trattamento_antitumorale____associables((String)null, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection tipo_trattamento_antitumorale____associables(String alias, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_trattamento_antitumorale____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tipo_trattamento_antitumorale____associables(Trattamento_antitumoraleTipo_trattamento_antitumorale____associablesParametrizedInput input, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        return tipo_trattamento_antitumorale____associables(null, input, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection tipo_trattamento_antitumorale____associables(String alias, Trattamento_antitumoraleTipo_trattamento_antitumorale____associablesParametrizedInput input, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_trattamento_antitumorale____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection tipo_trattamento_antitumorale_(Tipo_trattamento_antitumoraleResponseProjection subProjection) {
        return tipo_trattamento_antitumorale_(null, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection tipo_trattamento_antitumorale_(String alias, Tipo_trattamento_antitumoraleResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_trattamento_antitumorale_").alias(alias).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection h_Paziente_(H_PazienteResponseProjection subProjection) {
        return h_Paziente_(null, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection h_Paziente_(String alias, H_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("h_Paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection o_paziente_(O_PazienteResponseProjection subProjection) {
        return o_paziente_(null, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection o_paziente_(String alias, O_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("o_paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Trattamento_antitumoraleResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Trattamento_antitumoraleResponseProjection typename() {
        return typename(null);
    }

    public Trattamento_antitumoraleResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Trattamento_antitumoraleResponseProjection deepCopy$() {
        return new Trattamento_antitumoraleResponseProjection(this);
    }


}
