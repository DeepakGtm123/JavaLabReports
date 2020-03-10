### Grid Bag Layout
The Java GridBagLayout class is used to align components vertically, horizontally or along their baseline.
The components may not be of same size. Each GridBagLayout object maintains a dynamic, rectangular grid of cells. Each component occupies one or more cells known as its display area. Each component associates an instance of GridBagConstraints. With the help of constraints object we arrange component's display area on the grid. The GridBagLayout manages each component's minimum and preferred sizes in order to determine component's size.

### Fields
Modifier and Type | Field |	Description
---------- | ---------- | ----------
double[] | columnWeights | It is used to hold the overrides to the column weights.
int[] | columnWidths | It is used to hold the overrides to the column minimum width.
protected Hashtable<Component,GridBagConstraints> |	comptable |	It is used to maintains the association between a component and its gridbag constraints.
protected GridBagConstraints | defaultConstraints |	It is used to hold a gridbag constraints instance containing the default values.
protected GridBagLayoutInfo |	layoutInfo |	It is used to hold the layout information for the gridbag.
protected static int |	MAXGRIDSIZE |	No longer in use just for backward compatibility
protected static int |	MINSIZE |	It is smallest grid that can be laid out by the grid bag layout.
protected static int |	PREFERREDSIZE |	It is preferred grid size that can be laid out by the grid bag layout.
int[] |	rowHeights |	It is used to hold the overrides to the row minimum heights.
double[] |	rowWeights |	It is used to hold the overrides to the row weights.
