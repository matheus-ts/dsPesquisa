import React from 'react';

//Logo SVG
import { ReactComponent as Logo } from '../../assets/logo.svg';

import './styles.css';

const Header = () => {
    return (
        <header className="main-header">
            <Logo />
            <div className="logo-text">
                <span className="logo-text-1">
                    Big game
                </span>
                <span className="logo-text-2">
                    Survey
                </span>
            </div>
        </header>
    )
}

export default Header;