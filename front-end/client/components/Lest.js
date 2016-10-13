import React from 'react';
import { Link } from 'react-router';

const Lest = React.createClass({
    render() {
        const { type } = this.props;
        return (
            <Link
              style = {{lineHeight: '56px', margin: '0 5px', padding:'0 10px', textDecoration: 'none', color: '#1E88E5'}}
              to={`${type.url}`}>{type.name}</Link>
        )
    }
});

export default Lest;