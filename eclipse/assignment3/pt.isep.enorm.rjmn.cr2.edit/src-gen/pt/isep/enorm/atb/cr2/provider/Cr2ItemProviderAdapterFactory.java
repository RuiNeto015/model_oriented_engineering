/**
 */
package pt.isep.enorm.atb.cr2.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import pt.isep.enorm.atb.cr2.util.Cr2AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Cr2ItemProviderAdapterFactory extends Cr2AdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cr2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.Subject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectItemProvider subjectItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubjectAdapter() {
		if (subjectItemProvider == null) {
			subjectItemProvider = new SubjectItemProvider(this);
		}

		return subjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.Feature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.Review} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewItemProvider reviewItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.Review}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReviewAdapter() {
		if (reviewItemProvider == null) {
			reviewItemProvider = new ReviewItemProvider(this);
		}

		return reviewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.Comment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentItemProvider commentItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this);
		}

		return commentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.ModerationProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModerationProcessItemProvider moderationProcessItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.ModerationProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModerationProcessAdapter() {
		if (moderationProcessItemProvider == null) {
			moderationProcessItemProvider = new ModerationProcessItemProvider(this);
		}

		return moderationProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.End} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndItemProvider endItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.End}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndAdapter() {
		if (endItemProvider == null) {
			endItemProvider = new EndItemProvider(this);
		}

		return endItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.Automatic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomaticItemProvider automaticItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.Automatic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAutomaticAdapter() {
		if (automaticItemProvider == null) {
			automaticItemProvider = new AutomaticItemProvider(this);
		}

		return automaticItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pt.isep.enorm.atb.cr2.Manual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualItemProvider manualItemProvider;

	/**
	 * This creates an adapter for a {@link pt.isep.enorm.atb.cr2.Manual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManualAdapter() {
		if (manualItemProvider == null) {
			manualItemProvider = new ManualItemProvider(this);
		}

		return manualItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (modelItemProvider != null)
			modelItemProvider.dispose();
		if (subjectItemProvider != null)
			subjectItemProvider.dispose();
		if (featureItemProvider != null)
			featureItemProvider.dispose();
		if (reviewItemProvider != null)
			reviewItemProvider.dispose();
		if (commentItemProvider != null)
			commentItemProvider.dispose();
		if (moderationProcessItemProvider != null)
			moderationProcessItemProvider.dispose();
		if (endItemProvider != null)
			endItemProvider.dispose();
		if (automaticItemProvider != null)
			automaticItemProvider.dispose();
		if (manualItemProvider != null)
			manualItemProvider.dispose();
	}

}