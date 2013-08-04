zul.fontawesome.Icon = zk.$extends(zk.Widget, {

    _defaultType: 'icon-thumbs-up',
    _defaultSize: 'normal',
    _defaultPull: 'none',

    _type: 'icon-thumbs-up',
    _size: 'normal',
    _pull: 'none',
    _muted: false,
    _border: false,

    $define: {
        type: [
            function (type) {
                return !type ? this._defaultType : type;
            },
            function () {
                if (this.desktop) this.$n().className = this.domClass_();
            }
        ],
        size: [
            function (size) {
                return !size ? this._defaultSize : size;
            },
            function () {
                if (this.desktop) this.$n().className = this.domClass_();
            }
        ],
        pull: [
            function (pull) {
                return !pull ? this._defaultPull : pull;
            },
            function () {
                if (this.desktop) this.$n().className = this.domClass_();
            }
        ],
        muted: function () {
            if (this.desktop) this.$n().className = this.domClass_();
        },
        border: function () {
            if (this.desktop) this.$n().className = this.domClass_();
        }
    },

    // protected //
    bind_: function () {
        this.$supers(zul.fontawesome.Icon, 'bind_', arguments);
    },
    unbind_: function () {
        this.$supers(zul.fontawesome.Icon, 'unbind_', arguments);
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
            this._fontawesomePull() + ' ' +
            this._fontawesomeMuted() + ' ' +
            this._fontawesomeBorder();
    },

    _fontawesomeSize: function () {
        switch (this._size) {
            case 'normal':
                return '';
            default:
                return 'icon-' + this._size;
        }
    },

    _fontawesomePull: function () {
        switch (this._pull.toLowerCase()) {
            case 'none':
                return '';
            case 'left':
                return 'pull-left';
            case 'right':
                return 'pull-right';
            default:
                zk.error('Invalid FontAwesome pull: "' + this._pull + '"');
        }
    },

    _fontawesomeMuted: function () {
        return this._muted ? 'icon-muted' : '';
    },

    _fontawesomeBorder: function () {
        return this._border ? 'icon-border' : '';
    }

}, {

});