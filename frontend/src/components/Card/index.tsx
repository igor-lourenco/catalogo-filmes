import Score from "components/Score";
import { Link } from "react-router-dom";
import { Movie } from "types/movie";

type Props = {
  movie: Movie;
}

function Card({movie} : Props) {

  return (
    <div>
      <img
        className="dsmovie-movie-card-image"
        src={movie.imagem}
        alt={movie.titulo}
      />
      <div className="dsmovie-card-bottom-container">
        <h3>{movie.titulo}</h3>
        <Score count={movie.count} score={movie.pontuacao} />
        <Link to={`/form/${movie.id}`}>
          <div className="btn btn-primary dsmovie-btn">Avaliar</div>
        </Link>
      </div>
    </div>
  );
}

export default Card;
