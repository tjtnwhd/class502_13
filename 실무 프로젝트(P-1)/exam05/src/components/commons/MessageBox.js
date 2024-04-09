import React from 'react';

const MessageBox = ({ className, children }) => {
  return <div className={children}>{children}</div>;
};

export default React.memo(MessageBox);
