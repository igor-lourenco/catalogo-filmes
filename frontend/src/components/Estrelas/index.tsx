import {ReactComponent as Estrela_cheia} from 'assets/img/Estrela_cheia.svg';
import {ReactComponent as Estrela_metade} from 'assets/img/Estrela_metade.svg';
import {ReactComponent as Estrela_vazia} from 'assets/img/Estrela_vazia.svg';
import './styles.css';


function Estrela () {

    return (
        <div className='dsmovie-stars-container'>
        <Estrela_cheia />
        <Estrela_cheia />
        <Estrela_cheia />
        <Estrela_metade />
        <Estrela_vazia />
        </div>

    );
}

export default Estrela;