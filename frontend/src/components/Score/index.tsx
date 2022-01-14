import Estrela from "components/Estrelas";
import './styles.css';


type Props = {
  score: number;
  count: number;
}

function Score({count, score} : Props) {
  return (
    <div className="dsmovie-score-container">
      <p className="dsmovie-score-value">
        {score > 0 ? score.toFixed(1) : "-"}
      </p>
      <Estrela score={score} />
      <p className="dsmovie-score-count">{count} avaliações</p>
    </div>
  );
}

export default Score;
