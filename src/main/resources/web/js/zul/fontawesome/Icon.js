zul.fontawesome.Icon = zk.$extends(zk.Widget, {

    _defaultType: 'icon-thumbs-up',
    _defaultSize: 'normal',

    _type: 'icon-thumbs-up',
    _size: 'normal',
    _muted: false,

    getType: function () {
        return this._type;
    },

    setType: function (type) {
        if (!type) {
            type = this._defaultType;
        }
        if (this._type != type) {
            this._type = type;
            if (this.desktop) this.$n().className = this.domClass_();
        }
    },

    getSize: function () {
        return this._size;
    },

    setSize: function (size) {
        if (!size) {
            size = this._defaultSize;
        }
        if (this._size != size) {
            this._size = size;
            if (this.desktop) this.$n().className = this.domClass_();
        }
    },

    getMuted: function () {
        return this._muted;
    },

    setMuted: function (muted) {
        if (this._muted != muted) {
            this._muted = muted;
            if (this.desktop) this.$n().className = this.domClass_();
        }
    },

    domClass_: function (no) {
        var classes = this.$supers("domClass_", no) || '';
        if (classes) {
            classes += ' ';
        }
        classes += this._fontawesomeClasses();
        return classes.trim();
    },

    _fontawesomeClasses: function () {
        return   this._type + ' ' +
            this._fontawesomeSize() + ' ' +
            this._fontawesomeMuted();
    },

    _fontawesomeSize: function () {
        switch (this._size) {
            case 'normal':
                return '';
            default:
                return 'icon-' + this._size;
        }
    },

    _fontawesomeMuted: function () {
        return this._muted ? 'icon-muted' : '';
    }

}, {

});