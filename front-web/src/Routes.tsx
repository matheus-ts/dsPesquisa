import React from 'react';

import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Header from './components/header';
import Home from './Pages/Home';
import Records from './Pages/Records';

const Routes = () => (
    <BrowserRouter>
        <Header />
        <Switch>
            {/* Exact para carregar somente quando a url tiver exatamente o / */}
            <Route path="/" exact>
                <Home />
            </Route>
            <Route path="/records">
                <Records />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;