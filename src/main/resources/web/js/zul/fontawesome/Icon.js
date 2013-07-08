zul.fontawesome.Icon = zk.$extends(zk.Widget, {

    _type: '',


    getType: function () {
        return this._type;
    },

    setType: function (type) {
        if (this._type != type) {
            this._type = type;
            if (this.desktop) this.$n().className = zUtl.encodeXML(type);
        }
    },

    domClass_: function (no) {
        var classes = this.$supers("domClass_", no) || '';
        if (classes) {
            classes += ', ' + this._type;
        } else {
            classes = this._type;
        }
        return classes;
    }

}, {

});