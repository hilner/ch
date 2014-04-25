
package chstore.ch;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

/**
 *
 * @author gessyca.lm
 */
@ManagedBean
public class JogadorController {
    
    @Inject
    JogadorJPA jogadorJPA;
    private Jogador jogador;
    
    @PostConstruct
    public void inicializar(){
        jogador = new Jogador();
    }
    
    public void salvar(){
        jogadorJPA.salvar(jogador);
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
 
}
