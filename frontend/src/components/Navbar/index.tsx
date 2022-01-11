import { ReactComponent as GitHubIcon } from "assets/img/GitHub.svg";
import { Link } from "react-router-dom";
import "./styles.css";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="filme-nav-content">
          <Link to={`/`}>
            <h1>Catálogo filmes</h1>
          </Link>
          <a
            href="https://github.com/igor-lourenco"
            target="_blank"
            rel="noreferrer"
          >
            <div className="filme-contact-container">
              <GitHubIcon />
              <p className="filme-contact-link">/igor-lourenco</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
