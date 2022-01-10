import {ReactComponent as GitHubIcon} from 'assets/img/GitHub.svg';
import './styles.css';

function Navbar() {
    return (
        <header>
        <nav className="container">
            <div className="filme-nav-content">
                <h1>Catálogo filmes</h1>
                <a href="https://github.com/igor-lourenco" target="_blank" rel="noreferrer">
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