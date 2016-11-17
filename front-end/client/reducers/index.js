import { combineReducers } from 'redux'
import { routerReducer } from 'react-router-redux'

import grades from './grades'
import questions from './questions'
import selects from './selects'
import userList from './userList'
import courseList from './courseList';

const rootReducer = combineReducers({
  grades,
  selects,
  questions,
  userList,
  courseList,
  routing: routerReducer
});

export default rootReducer